.class final Lo/ebl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebl;->e(Ljava/lang/String;)Ljava/io/FilenameFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/util/Collection;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V
    .locals 0

    .line 237
    iput p1, p0, Lo/ebl$3;->a:I

    iput-object p2, p0, Lo/ebl$3;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/ebl$3;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/ebl$3;->c:Ljava/util/Collection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    .line 241
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lo/ebl$3;->a:I

    if-gt v0, v1, :cond_2

    .line 243
    iget-object v0, p0, Lo/ebl$3;->b:Ljava/lang/String;

    const-string v1, "index_language_"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    const/4 v0, 0x0

    return v0

    .line 248
    :cond_0
    const-string v0, "index_language_"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    const/4 v0, 0x1

    return v0

    .line 252
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 256
    :cond_2
    iget-object v0, p0, Lo/ebl$3;->d:Ljava/lang/String;

    iget v1, p0, Lo/ebl$3;->a:I

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 257
    const/4 v0, 0x0

    return v0

    .line 261
    :cond_3
    iget v0, p0, Lo/ebl$3;->a:I

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 262
    iget-object v0, p0, Lo/ebl$3;->c:Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 263
    const/4 v0, 0x1

    return v0

    .line 266
    :cond_4
    const/4 v0, 0x0

    return v0
.end method
