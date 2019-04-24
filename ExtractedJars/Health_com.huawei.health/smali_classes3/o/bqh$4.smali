.class final Lo/bqh$4;
.super Lo/bqh;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bqh;->d(Ljava/lang/String;[BII)Lo/bqh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:[B

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>(Ljava/lang/String;I[BI)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/bqh$4;->b:Ljava/lang/String;

    iput p2, p0, Lo/bqh$4;->c:I

    iput-object p3, p0, Lo/bqh$4;->a:[B

    iput p4, p0, Lo/bqh$4;->d:I

    invoke-direct {p0}, Lo/bqh;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/bqh$4;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lo/bqh$4;->a:[B

    iget v1, p0, Lo/bqh$4;->d:I

    iget v2, p0, Lo/bqh$4;->c:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 92
    return-void
.end method

.method public e()J
    .locals 2

    .line 79
    iget v0, p0, Lo/bqh$4;->c:I

    int-to-long v0, v0

    return-wide v0
.end method
