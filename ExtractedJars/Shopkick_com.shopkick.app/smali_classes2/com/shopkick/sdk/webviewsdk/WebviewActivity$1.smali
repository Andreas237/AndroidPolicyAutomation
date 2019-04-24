.class Lcom/shopkick/sdk/webviewsdk/WebviewActivity$1;
.super Ljava/lang/Object;
.source "WebviewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/webviewsdk/WebviewActivity;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$1;->this$0:Lcom/shopkick/sdk/webviewsdk/WebviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 56
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$1;->this$0:Lcom/shopkick/sdk/webviewsdk/WebviewActivity;

    invoke-virtual {p1}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->finish()V

    return-void
.end method
