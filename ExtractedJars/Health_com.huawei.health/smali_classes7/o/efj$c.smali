.class public Lo/efj$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/efj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<[F>;"
    }
.end annotation


# instance fields
.field private a:Ljava/io/InputStream;

.field final synthetic b:Lo/efj;

.field private c:I

.field private d:Lo/efj$a;


# direct methods
.method public constructor <init>(Lo/efj;Ljava/io/InputStream;ILo/efj$a;)V
    .locals 3

    .line 88
    iput-object p1, p0, Lo/efj$c;->b:Lo/efj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    if-nez p2, :cond_0

    .line 90
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " InputStream can not be null dataType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_0
    iput-object p2, p0, Lo/efj$c;->a:Ljava/io/InputStream;

    .line 93
    iput p3, p0, Lo/efj$c;->c:I

    .line 94
    iput-object p4, p0, Lo/efj$c;->d:Lo/efj$a;

    .line 95
    return-void
.end method


# virtual methods
.method public a()[F
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lo/efj$c;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    new-array v4, v0, [B

    .line 100
    iget-object v0, p0, Lo/efj$c;->a:Ljava/io/InputStream;

    array-length v1, v4

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2, v1}, Ljava/io/InputStream;->read([BII)I

    .line 101
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 102
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 103
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    new-array v6, v0, [F

    .line 104
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/nio/FloatBuffer;->get([F)Ljava/nio/FloatBuffer;

    .line 105
    iget v0, p0, Lo/efj$c;->c:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 107
    :pswitch_0
    iget-object v0, p0, Lo/efj$c;->b:Lo/efj;

    invoke-static {v0, v6}, Lo/efj;->a(Lo/efj;[F)[F

    .line 108
    goto :goto_0

    .line 110
    :pswitch_1
    iget-object v0, p0, Lo/efj$c;->b:Lo/efj;

    invoke-static {v0, v6}, Lo/efj;->d(Lo/efj;[F)[F

    .line 111
    goto :goto_0

    .line 113
    :pswitch_2
    iget-object v0, p0, Lo/efj$c;->b:Lo/efj;

    invoke-static {v0, v6}, Lo/efj;->e(Lo/efj;[F)[F

    .line 114
    .line 118
    :goto_0
    iget-object v0, p0, Lo/efj$c;->b:Lo/efj;

    const-string v1, ""

    iget-object v2, p0, Lo/efj$c;->d:Lo/efj$a;

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/efj;->c(Lo/efj;ILjava/lang/String;Lo/efj$a;)V

    .line 119
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 83
    invoke-virtual {p0}, Lo/efj$c;->a()[F

    move-result-object v0

    return-object v0
.end method
