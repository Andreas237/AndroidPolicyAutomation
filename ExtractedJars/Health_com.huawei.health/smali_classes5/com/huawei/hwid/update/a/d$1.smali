.class Lcom/huawei/hwid/update/a/d$1;
.super Lcom/huawei/hwid/update/a/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/update/a/d;->a(Ljava/io/File;ILjava/lang/String;)Lcom/huawei/hwid/update/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/hwid/update/a/d;

.field private d:J

.field private e:I


# direct methods
.method constructor <init>(Lcom/huawei/hwid/update/a/d;Ljava/io/File;IILjava/lang/String;)V
    .locals 2

    .line 269
    iput-object p1, p0, Lcom/huawei/hwid/update/a/d$1;->c:Lcom/huawei/hwid/update/a/d;

    iput p4, p0, Lcom/huawei/hwid/update/a/d$1;->a:I

    iput-object p5, p0, Lcom/huawei/hwid/update/a/d$1;->b:Ljava/lang/String;

    invoke-direct {p0, p2, p3}, Lcom/huawei/hwid/update/a/b;-><init>(Ljava/io/File;I)V

    .line 272
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwid/update/a/d$1;->d:J

    .line 275
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d$1;->c:Lcom/huawei/hwid/update/a/d;

    invoke-static {v0}, Lcom/huawei/hwid/update/a/d;->a(Lcom/huawei/hwid/update/a/d;)Lcom/huawei/hwid/update/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/update/a/a;->b()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/update/a/d$1;->e:I

    return-void
.end method

.method private a(I)V
    .locals 3

    .line 304
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d$1;->c:Lcom/huawei/hwid/update/a/d;

    invoke-static {v0}, Lcom/huawei/hwid/update/a/d;->a(Lcom/huawei/hwid/update/a/d;)Lcom/huawei/hwid/update/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/update/a/d$1;->c:Lcom/huawei/hwid/update/a/d;

    invoke-virtual {v1}, Lcom/huawei/hwid/update/a/d;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwid/update/a/d$1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2}, Lcom/huawei/hwid/update/a/a;->a(Landroid/content/Context;ILjava/lang/String;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d$1;->c:Lcom/huawei/hwid/update/a/d;

    iget v1, p0, Lcom/huawei/hwid/update/a/d$1;->a:I

    const/16 v2, 0x834

    invoke-static {v0, v2, p1, v1}, Lcom/huawei/hwid/update/a/d;->a(Lcom/huawei/hwid/update/a/d;III)V

    .line 306
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

    .line 279
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/hwid/update/a/b;->write([BII)V

    .line 281
    iget v0, p0, Lcom/huawei/hwid/update/a/d$1;->e:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/huawei/hwid/update/a/d$1;->e:I

    .line 283
    iget v0, p0, Lcom/huawei/hwid/update/a/d$1;->e:I

    const/high16 v1, 0xc800000

    if-le v0, v1, :cond_0

    .line 285
    return-void

    .line 288
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 289
    iget-wide v0, p0, Lcom/huawei/hwid/update/a/d$1;->d:J

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 290
    iput-wide v4, p0, Lcom/huawei/hwid/update/a/d$1;->d:J

    .line 291
    iget v0, p0, Lcom/huawei/hwid/update/a/d$1;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/a/d$1;->a(I)V

    .line 295
    :cond_1
    iget v0, p0, Lcom/huawei/hwid/update/a/d$1;->e:I

    iget v1, p0, Lcom/huawei/hwid/update/a/d$1;->a:I

    if-ne v0, v1, :cond_2

    .line 296
    iget v0, p0, Lcom/huawei/hwid/update/a/d$1;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/a/d$1;->a(I)V

    .line 298
    :cond_2
    return-void
.end method
