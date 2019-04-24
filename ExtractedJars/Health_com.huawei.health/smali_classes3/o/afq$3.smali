.class Lo/afq$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq;->e(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/afq;


# direct methods
.method constructor <init>(Lo/afq;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lo/afq$3;->e:Lo/afq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 5

    .line 308
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 309
    invoke-static {p2}, Lo/aet;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 310
    if-eqz v4, :cond_0

    .line 311
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceCloudUtil toDownloadZipFilesFromKind is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    iget-object v0, p0, Lo/afq$3;->e:Lo/afq;

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lo/afq;->b(Lo/afq;Ljava/util/List;Z)V

    .line 315
    :cond_0
    return-void
.end method
