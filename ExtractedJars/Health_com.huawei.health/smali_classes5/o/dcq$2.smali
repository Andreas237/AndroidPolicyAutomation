.class Lo/dcq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dcq;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/dcq;

.field final synthetic d:Lo/dcx;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/dcq;Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/dcq$2;->b:Lo/dcq;

    iput-object p2, p0, Lo/dcq$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/dcq$2;->e:Ljava/lang/String;

    iput-object p4, p0, Lo/dcq$2;->d:Lo/dcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 83
    new-instance v4, Lo/ddb;

    invoke-direct {v4}, Lo/ddb;-><init>()V

    .line 84
    iget-object v0, p0, Lo/dcq$2;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dcq$2;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 85
    :cond_0
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValue, key or value is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const v0, 0x30d44

    invoke-virtual {v4, v0}, Lo/ddb;->e(I)V

    goto/16 :goto_1

    .line 88
    :cond_1
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 89
    const-string v0, "key"

    iget-object v1, p0, Lo/dcq$2;->a:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "value"

    iget-object v1, p0, Lo/dcq$2;->e:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :try_start_0
    invoke-static {}, Lo/dcq;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lo/dcq$2;->b:Lo/dcq;

    invoke-static {v1}, Lo/dcq;->a(Lo/dcq;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v6

    .line 93
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 94
    invoke-static {v6}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 95
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValue success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/ddb;->e(I)V

    goto :goto_0

    .line 98
    :cond_2
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValue failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const v0, 0x31128

    invoke-virtual {v4, v0}, Lo/ddb;->e(I)V

    goto :goto_0

    .line 102
    :cond_3
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValue failed with null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const v0, 0x31128

    invoke-virtual {v4, v0}, Lo/ddb;->e(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :goto_0
    goto :goto_1

    .line 105
    :catch_0
    move-exception v6

    .line 106
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setValue failed with e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const v0, 0x31128

    invoke-virtual {v4, v0}, Lo/ddb;->e(I)V

    .line 108
    iget-object v0, p0, Lo/dcq$2;->d:Lo/dcx;

    invoke-static {v0, v4}, Lo/dcq;->a(Lo/dcx;Lo/ddb;)V

    .line 111
    :goto_1
    iget-object v0, p0, Lo/dcq$2;->d:Lo/dcx;

    invoke-static {v0, v4}, Lo/dcq;->a(Lo/dcx;Lo/ddb;)V

    .line 112
    return-void
.end method
