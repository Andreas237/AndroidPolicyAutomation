.class Lcom/huawei/operation/activity/WebViewActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBarRightQuitAct()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/activity/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 1090
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$7;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1093
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomTitleBarRightQuitAct onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$7;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$3400(Lcom/huawei/operation/activity/WebViewActivity;Landroid/view/View;)V

    .line 1095
    return-void
.end method
