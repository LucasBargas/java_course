using Microsoft.Xrm.Sdk;
using Microsoft.Xrm.Sdk.Query;
using System;
 
namespace TreinamentoPlugins
{
    public class ContatoPreOperationCreateSync : IPlugin
    {
        public void Execute(IServiceProvider serviceProvider)
        {
            var context = (IPluginExecutionContext)serviceProvider.GetService(typeof(IPluginExecutionContext));
            var serviceFactory = (IOrganizationServiceFactory)serviceProvider.GetService(typeof(IOrganizationServiceFactory));
            var crmService = serviceFactory.CreateOrganizationService(context.UserId);
            var trace = (ITracingService)serviceProvider.GetService(typeof(ITracingService));
 
            trace.Trace("Início Plugin");
 
            if (context.MessageName.ToLower() == "create"
&& context.Mode == Convert.ToInt32(MeuEnum.Mode.Synchronous)
&& context.Stage == Convert.ToInt32(MeuEnum.Stage.PreOperation)
            )
            {
                Entity entidadeContexto = null;
 
                if (context.InputParameters.Contains("Target"))
                    entidadeContexto = (Entity)context.InputParameters["Target"];
            }
        }
    }
}