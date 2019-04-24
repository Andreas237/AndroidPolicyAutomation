.class public Lo/axx;
.super Lo/bfh;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 22
    const/16 v0, 0x23

    invoke-virtual {p0, v0}, Lo/axx;->setCardType(I)V

    .line 23
    return-void
.end method

.method public constructor <init>(Lo/bfp$c;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/axx;-><init>()V

    .line 28
    invoke-virtual {p0, p1}, Lo/axx;->setEventType(Lo/bfp$c;)V

    .line 29
    return-void
.end method
