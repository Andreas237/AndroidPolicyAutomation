.class Lcom/huawei/operation/js/JsInteraction$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/js/JsInteraction;->uploadSleepQuestionnaireResults(JLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/js/JsInteraction;

.field final synthetic val$callback:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V
    .locals 0

    .line 2166
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction$4;->this$0:Lcom/huawei/operation/js/JsInteraction;

    iput-object p2, p0, Lcom/huawei/operation/js/JsInteraction$4;->val$callback:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 2170
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction$4;->this$0:Lcom/huawei/operation/js/JsInteraction;

    invoke-static {v0}, Lcom/huawei/operation/js/JsInteraction;->access$200(Lcom/huawei/operation/js/JsInteraction;)Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2171
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction$4;->this$0:Lcom/huawei/operation/js/JsInteraction;

    invoke-static {v0}, Lcom/huawei/operation/js/JsInteraction;->access$200(Lcom/huawei/operation/js/JsInteraction;)Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/operation/js/JsInteraction$4;->val$callback:Ljava/lang/String;

    invoke-interface {v0, p1, v1, v2}, Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;->callSleepQuestionnaireJsFuncion(ILjava/lang/String;Ljava/lang/String;)V

    .line 2173
    :cond_0
    return-void
.end method
