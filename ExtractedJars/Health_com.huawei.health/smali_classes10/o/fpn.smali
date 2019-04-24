.class public Lo/fpn;
.super Lo/fpr;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 17
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/fpr;-><init>(Ljava/lang/String;Ljava/lang/ThreadGroup;)V

    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/ThreadGroup;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lo/fpr;-><init>(Ljava/lang/String;Ljava/lang/ThreadGroup;)V

    .line 30
    return-void
.end method


# virtual methods
.method protected e()Z
    .locals 1

    .line 39
    const/4 v0, 0x1

    return v0
.end method
