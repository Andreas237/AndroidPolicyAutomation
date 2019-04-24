.class Lo/fjo$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjo;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fjo;


# direct methods
.method constructor <init>(Lo/fjo;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lo/fjo$4;->a:Lo/fjo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 4

    .line 57
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===Connected!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 62
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 63
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===Connection lost.  Cause: Network Lost."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 64
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 66
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===Connection lost.  Reason: Service Disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    :cond_1
    :goto_0
    return-void
.end method
