.class Lo/aaf$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aai;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aaf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:Lo/aah;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/aah<Lo/aaa;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo/aah;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/aah<Lo/aaa;>;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lo/aaf$c;->a:Lo/aah;

    .line 42
    return-void
.end method

.method synthetic constructor <init>(Lo/aah;Lo/aaf$c;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/aaf$c;-><init>(Lo/aah;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 2

    .line 57
    new-instance v1, Lo/aaa;

    const-string v0, "request Failed"

    invoke-direct {v1, p1, v0}, Lo/aaa;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lo/aaf$c;->a:Lo/aah;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lo/aaf$c;->a:Lo/aah;

    invoke-interface {v0, v1}, Lo/aah;->a(Lo/aag;)V

    .line 62
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 47
    new-instance v1, Lo/aaa;

    invoke-direct {v1, p1}, Lo/aaa;-><init>(Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lo/aaf$c;->a:Lo/aah;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lo/aaf$c;->a:Lo/aah;

    invoke-interface {v0, v1}, Lo/aah;->a(Lo/aag;)V

    .line 52
    :cond_0
    return-void
.end method
