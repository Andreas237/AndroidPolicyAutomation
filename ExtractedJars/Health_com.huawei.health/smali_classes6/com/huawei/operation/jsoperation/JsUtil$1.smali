.class final Lcom/huawei/operation/jsoperation/JsUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Lcom/huawei/operation/activity/WebViewActivity;

.field final synthetic val$jsFunc:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/JsUtil$1;->val$activity:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p2, p0, Lcom/huawei/operation/jsoperation/JsUtil$1;->val$jsFunc:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/JsUtil$1;->val$activity:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/JsUtil$1;->val$jsFunc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->startLoadJS(Ljava/lang/String;)V

    .line 100
    return-void
.end method
