.class public Lo/ayd;
.super Lo/bfh;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 21
    const/16 v0, 0x24

    invoke-virtual {p0, v0}, Lo/ayd;->setCardType(I)V

    .line 22
    return-void
.end method
