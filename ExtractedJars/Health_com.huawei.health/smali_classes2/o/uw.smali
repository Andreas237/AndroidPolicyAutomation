.class final Lo/uw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final c:[B

.field private final d:[B


# direct methods
.method constructor <init>([B[B)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lo/uw;->c:[B

    .line 26
    iput-object p2, p0, Lo/uw;->d:[B

    .line 27
    return-void
.end method


# virtual methods
.method public d()[B
    .locals 1

    .line 34
    iget-object v0, p0, Lo/uw;->d:[B

    return-object v0
.end method

.method public e()[B
    .locals 1

    .line 30
    iget-object v0, p0, Lo/uw;->c:[B

    return-object v0
.end method
