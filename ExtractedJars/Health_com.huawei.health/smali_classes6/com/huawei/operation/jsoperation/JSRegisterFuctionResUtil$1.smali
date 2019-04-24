.class final Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil;->callBackResStatus(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Lcom/huawei/operation/activity/WebViewActivity;

.field final synthetic val$jsUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil$1;->val$activity:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p2, p0, Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil$1;->val$jsUrl:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 20
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil$1;->val$activity:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil$1;->val$jsUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->startLoadJS(Ljava/lang/String;)V

    .line 21
    return-void
.end method
