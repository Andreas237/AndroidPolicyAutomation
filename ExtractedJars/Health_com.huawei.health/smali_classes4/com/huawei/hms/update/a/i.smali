.class Lcom/huawei/hms/update/a/i;
.super Lcom/huawei/hms/update/a/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/hms/update/a/h;

.field private d:J

.field private e:I


# direct methods
.method constructor <init>(Lcom/huawei/hms/update/a/h;Ljava/io/File;IILjava/lang/String;)V
    .locals 2

    .line 267
    iput-object p1, p0, Lcom/huawei/hms/update/a/i;->c:Lcom/huawei/hms/update/a/h;

    iput p4, p0, Lcom/huawei/hms/update/a/i;->a:I

    iput-object p5, p0, Lcom/huawei/hms/update/a/i;->b:Ljava/lang/String;

    invoke-direct {p0, p2, p3}, Lcom/huawei/hms/update/a/b;-><init>(Ljava/io/File;I)V

    .line 270
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/update/a/i;->d:J

    .line 273
    iget-object v0, p0, Lcom/huawei/hms/update/a/i;->c:Lcom/huawei/hms/update/a/h;

    invoke-static {v0}, Lcom/huawei/hms/update/a/h;->a(Lcom/huawei/hms/update/a/h;)Lcom/huawei/hms/update/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/update/a/a;->b()I

    move-result v0

    iput v0, p0, Lcom/huawei/hms/update/a/i;->e:I

    return-void
.end method

.method private a(I)V
    .locals 3

    .line 302
    iget-object v0, p0, Lcom/huawei/hms/update/a/i;->c:Lcom/huawei/hms/update/a/h;

    invoke-static {v0}, Lcom/huawei/hms/update/a/h;->a(Lcom/huawei/hms/update/a/h;)Lcom/huawei/hms/update/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/update/a/i;->c:Lcom/huawei/hms/update/a/h;

    invoke-virtual {v1}, Lcom/huawei/hms/update/a/h;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/update/a/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2}, Lcom/huawei/hms/update/a/a;->a(Landroid/content/Context;ILjava/lang/String;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/hms/update/a/i;->c:Lcom/huawei/hms/update/a/h;

    iget v1, p0, Lcom/huawei/hms/update/a/i;->a:I

    const/16 v2, 0x834

    invoke-static {v0, v2, p1, v1}, Lcom/huawei/hms/update/a/h;->a(Lcom/huawei/hms/update/a/h;III)V

    .line 304
    return-void
.end method


# virtual methods
.method public write([BII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 277
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/hms/update/a/b;->write([BII)V

    .line 279
    iget v0, p0, Lcom/huawei/hms/update/a/i;->e:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/huawei/hms/update/a/i;->e:I

    .line 281
    iget v0, p0, Lcom/huawei/hms/update/a/i;->e:I

    const/high16 v1, 0xc800000

    if-le v0, v1, :cond_0

    .line 283
    return-void

    .line 286
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 287
    iget-wide v0, p0, Lcom/huawei/hms/update/a/i;->d:J

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 288
    iput-wide v4, p0, Lcom/huawei/hms/update/a/i;->d:J

    .line 289
    iget v0, p0, Lcom/huawei/hms/update/a/i;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/hms/update/a/i;->a(I)V

    .line 293
    :cond_1
    iget v0, p0, Lcom/huawei/hms/update/a/i;->e:I

    iget v1, p0, Lcom/huawei/hms/update/a/i;->a:I

    if-ne v0, v1, :cond_2

    .line 294
    iget v0, p0, Lcom/huawei/hms/update/a/i;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/hms/update/a/i;->a(I)V

    .line 296
    :cond_2
    return-void
.end method
