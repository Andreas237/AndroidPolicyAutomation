.class Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sina/weibo/sdk/share/WbShareTransActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TransResourceResult"
.end annotation


# instance fields
.field message:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

.field final synthetic this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

.field transDone:Z


# direct methods
.method private constructor <init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;Lcom/sina/weibo/sdk/share/WbShareTransActivity$1;)V
    .locals 0

    .line 264
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;-><init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;)V

    return-void
.end method
