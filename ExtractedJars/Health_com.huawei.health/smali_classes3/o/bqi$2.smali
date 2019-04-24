.class final Lo/bqi$2;
.super Lo/bqi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bqi;->c(Ljava/lang/String;JLjava/io/InputStream;)Lo/bqi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/InputStream;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:J


# direct methods
.method constructor <init>(Ljava/lang/String;JLjava/io/InputStream;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lo/bqi$2;->b:Ljava/lang/String;

    iput-wide p2, p0, Lo/bqi$2;->d:J

    iput-object p4, p0, Lo/bqi$2;->a:Ljava/io/InputStream;

    invoke-direct {p0}, Lo/bqi;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/io/InputStream;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/bqi$2;->a:Ljava/io/InputStream;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lo/bqi$2;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()J
    .locals 2

    .line 155
    iget-wide v0, p0, Lo/bqi$2;->d:J

    return-wide v0
.end method
