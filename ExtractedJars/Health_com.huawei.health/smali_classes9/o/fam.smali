.class public Lo/fam;
.super Lo/ehz;
.source "SourceFile"


# instance fields
.field private b:Lo/fai;


# direct methods
.method public constructor <init>(FLo/fai;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lo/ehz;-><init>(F)V

    .line 17
    iput-object p2, p0, Lo/fam;->b:Lo/fai;

    .line 18
    return-void
.end method


# virtual methods
.method public a()Lo/fai;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/fam;->b:Lo/fai;

    return-object v0
.end method
