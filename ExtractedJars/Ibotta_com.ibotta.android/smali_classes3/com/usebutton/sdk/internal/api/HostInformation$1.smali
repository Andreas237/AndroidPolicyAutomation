.class final Lcom/usebutton/sdk/internal/api/HostInformation$1;
.super Ljava/lang/Object;
.source "HostInformation.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/ConfigurationOverride;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/HostInformation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBaseUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "https://%s.mobileapi.usebutton.com"

    return-object v0
.end method
