.class Lo/aqs$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aqs;->e(Lo/aqu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/aqs;


# direct methods
.method constructor <init>(Lo/aqs;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lo/aqs$5;->a:Lo/aqs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 289
    iget-object v0, p0, Lo/aqs$5;->a:Lo/aqs;

    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aqs;->c(Ljava/lang/String;)V

    .line 290
    return-void
.end method
