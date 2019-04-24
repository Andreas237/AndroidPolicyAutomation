.class Lo/fmw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmw$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fmw;->c(Ljava/lang/String;I)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/fmw$b<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lo/fmw;


# direct methods
.method constructor <init>(Lo/fmw;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lo/fmw$4;->e:Lo/fmw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 443
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 439
    invoke-virtual {p0, p1}, Lo/fmw$4;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
