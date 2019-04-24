.class public Lo/bbd;
.super Lo/bbi;
.source "SourceFile"


# instance fields
.field private k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 22
    invoke-direct {p0, p1, p2}, Lo/bbi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bbd;->k:Z

    .line 23
    iput-boolean p3, p0, Lo/bbd;->k:Z

    .line 24
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lo/bbd;->k:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 29
    invoke-super {p0, p1}, Lo/bbi;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 35
    invoke-super {p0}, Lo/bbi;->hashCode()I

    move-result v0

    return v0
.end method
