.class Lcom/mopub/mobileads/MoPubConversionTracker$1;
.super Ljava/lang/Object;
.source "MoPubConversionTracker.java"

# interfaces
.implements Lcom/mopub/network/TrackingRequest$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/MoPubConversionTracker;->reportAppOpen(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/MoPubConversionTracker;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MoPubConversionTracker;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker$1;->this$0:Lcom/mopub/mobileads/MoPubConversionTracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 0

    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 36
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker$1;->this$0:Lcom/mopub/mobileads/MoPubConversionTracker;

    invoke-static {p1}, Lcom/mopub/mobileads/MoPubConversionTracker;->access$200(Lcom/mopub/mobileads/MoPubConversionTracker;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker$1;->this$0:Lcom/mopub/mobileads/MoPubConversionTracker;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubConversionTracker;->access$100(Lcom/mopub/mobileads/MoPubConversionTracker;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
