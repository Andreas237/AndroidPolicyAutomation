.class public Lo/aal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lo/aab;

.field private d:Lo/aai;


# direct methods
.method public constructor <init>(Lo/aab;Lo/aai;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lo/aal;->b:Lo/aab;

    .line 30
    iput-object p2, p0, Lo/aal;->d:Lo/aai;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Lo/aai;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aal;->d:Lo/aai;

    return-object v0
.end method

.method public c()Lo/aab;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/aal;->b:Lo/aab;

    return-object v0
.end method
