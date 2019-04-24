.class public Lo/fsk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fso;


# instance fields
.field private final b:[B

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lo/fsk;->d:Ljava/lang/String;

    .line 30
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fsk;->b:[B

    .line 31
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)[B
    .locals 1

    .line 40
    iget-object v0, p0, Lo/fsk;->b:[B

    return-object v0
.end method

.method public c(Lo/fsr;Ljava/lang/String;)[B
    .locals 1

    .line 45
    iget-object v0, p0, Lo/fsk;->b:[B

    return-object v0
.end method

.method public d(Ljava/net/InetSocketAddress;)Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/fsk;->d:Ljava/lang/String;

    return-object v0
.end method
