.class public Lo/qw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Lo/qr;

.field private final c:[Lo/ou;


# direct methods
.method public constructor <init>(Lo/qr;[Lo/ou;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lo/qw;->b:Lo/qr;

    .line 35
    iput-object p2, p0, Lo/qw;->c:[Lo/ou;

    .line 36
    return-void
.end method


# virtual methods
.method public final c()[Lo/ou;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/qw;->c:[Lo/ou;

    return-object v0
.end method

.method public final d()Lo/qr;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/qw;->b:Lo/qr;

    return-object v0
.end method
