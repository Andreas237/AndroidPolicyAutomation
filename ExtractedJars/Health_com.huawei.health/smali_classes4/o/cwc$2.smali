.class Lo/cwc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwc;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cwc;


# direct methods
.method constructor <init>(Lo/cwc;)V
    .locals 0

    .line 1384
    iput-object p1, p0, Lo/cwc$2;->d:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Z)V
    .locals 4

    .line 1387
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregRunningPostureListener isSuccess = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1388
    iget-object v0, p0, Lo/cwc$2;->d:Lo/cwc;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cwc;->d(Lo/cwc;Lo/cet;)Lo/cet;

    .line 1389
    return-void
.end method
