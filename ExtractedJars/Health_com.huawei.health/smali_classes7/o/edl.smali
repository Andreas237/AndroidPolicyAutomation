.class public final Lo/edl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/oy;


# instance fields
.field private final c:Lo/edn;


# direct methods
.method public constructor <init>(Lo/edn;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lo/edl;->c:Lo/edn;

    .line 16
    return-void
.end method


# virtual methods
.method public foundPossibleResultPoint(Lo/ou;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lo/edl;->c:Lo/edn;

    invoke-virtual {v0, p1}, Lo/edn;->d(Lo/ou;)V

    .line 12
    return-void
.end method
