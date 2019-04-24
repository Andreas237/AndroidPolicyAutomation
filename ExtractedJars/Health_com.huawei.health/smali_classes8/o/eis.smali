.class public Lo/eis;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejp;


# instance fields
.field private e:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lo/eis;->e:F

    .line 14
    return-void
.end method


# virtual methods
.method public b()F
    .locals 1

    .line 17
    iget v0, p0, Lo/eis;->e:F

    return v0
.end method
