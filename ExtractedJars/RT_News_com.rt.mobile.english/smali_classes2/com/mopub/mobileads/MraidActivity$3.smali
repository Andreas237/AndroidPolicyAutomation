.class Lcom/mopub/mobileads/MraidActivity$3;
.super Ljava/lang/Object;
.source "MraidActivity.java"

# interfaces
.implements Lcom/mopub/mraid/MraidController$UseCustomCloseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/MraidActivity;->getAdView()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/MraidActivity;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MraidActivity;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/mopub/mobileads/MraidActivity$3;->this$0:Lcom/mopub/mobileads/MraidActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public useCustomCloseChanged(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 146
    iget-object p1, p0, Lcom/mopub/mobileads/MraidActivity$3;->this$0:Lcom/mopub/mobileads/MraidActivity;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MraidActivity;->hideInterstitialCloseButton()V

    goto :goto_0

    .line 148
    :cond_0
    iget-object p1, p0, Lcom/mopub/mobileads/MraidActivity$3;->this$0:Lcom/mopub/mobileads/MraidActivity;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MraidActivity;->showInterstitialCloseButton()V

    :goto_0
    return-void
.end method
