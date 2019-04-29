.class Lcom/mopub/mobileads/BaseInterstitialActivity$1;
.super Ljava/lang/Object;
.source "BaseInterstitialActivity.java"

# interfaces
.implements Lcom/mopub/common/CloseableLayout$OnCloseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/BaseInterstitialActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/BaseInterstitialActivity;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/BaseInterstitialActivity;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/mopub/mobileads/BaseInterstitialActivity$1;->this$0:Lcom/mopub/mobileads/BaseInterstitialActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClose()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/mopub/mobileads/BaseInterstitialActivity$1;->this$0:Lcom/mopub/mobileads/BaseInterstitialActivity;

    invoke-virtual {v0}, Lcom/mopub/mobileads/BaseInterstitialActivity;->finish()V

    return-void
.end method
