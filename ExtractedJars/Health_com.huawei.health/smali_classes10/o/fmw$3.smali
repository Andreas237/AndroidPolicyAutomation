.class Lo/fmw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmw$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fmw;->a(Ljava/lang/String;F)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/fmw$b<Ljava/lang/Float;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/fmw;


# direct methods
.method constructor <init>(Lo/fmw;)V
    .locals 0

    .line 500
    iput-object p1, p0, Lo/fmw$3;->a:Lo/fmw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/lang/Float;
    .locals 1

    .line 504
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 500
    invoke-virtual {p0, p1}, Lo/fmw$3;->b(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
