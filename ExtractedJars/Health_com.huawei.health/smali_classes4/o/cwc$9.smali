.class Lo/cwc$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwc;->q()Lo/cmj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cwc;


# direct methods
.method constructor <init>(Lo/cwc;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lo/cwc$9;->e:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 462
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthOpenSDKCallback : initSDK onServiceException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 452
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthOpenSDKCallback initSDK success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 457
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthOpenSDKCallback : initSDK Failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    return-void
.end method
