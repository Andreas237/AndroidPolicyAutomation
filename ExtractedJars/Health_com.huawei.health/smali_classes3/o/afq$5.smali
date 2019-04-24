.class Lo/afq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/afq;


# direct methods
.method constructor <init>(Lo/afq;Ljava/lang/String;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lo/afq$5;->b:Lo/afq;

    iput-object p2, p0, Lo/afq$5;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 4

    .line 270
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 271
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceCloudUtil toDownloadSingleXmlFile() rescode ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lo/afq$5;->b:Lo/afq;

    invoke-static {p2}, Lo/aet;->a(Ljava/lang/String;)Lo/afr;

    move-result-object v1

    iget-object v2, p0, Lo/afq$5;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/afq;->e(Lo/afq;Lo/afr;Ljava/lang/String;)V

    .line 274
    :cond_0
    return-void
.end method
