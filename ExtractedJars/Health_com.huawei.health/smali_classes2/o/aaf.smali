.class public Lo/aaf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/zz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aaf$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/zs;Lo/zo;Lo/aah;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/zs;Lo/zo;Lo/aah<Lo/aaa;>;)V"
        }
    .end annotation

    .line 26
    if-nez p3, :cond_0

    .line 28
    const-string v0, "obtainGrsRooter requestCallback is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 30
    :cond_0
    new-instance v4, Lo/aad;

    invoke-direct {v4, p1, p2}, Lo/aad;-><init>(Lo/zs;Lo/zo;)V

    .line 31
    invoke-static {}, Lo/aam;->a()Lo/aam;

    move-result-object v0

    new-instance v1, Lo/aal;

    new-instance v2, Lo/aaf$c;

    .line 32
    const/4 v3, 0x0

    invoke-direct {v2, p3, v3}, Lo/aaf$c;-><init>(Lo/aah;Lo/aaf$c;)V

    invoke-direct {v1, v4, v2}, Lo/aal;-><init>(Lo/aab;Lo/aai;)V

    .line 31
    invoke-virtual {v0, v1}, Lo/aam;->d(Lo/aal;)V

    .line 33
    return-void
.end method
