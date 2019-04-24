.class Lo/byz$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/byz;


# direct methods
.method constructor <init>(Lo/byz;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/byz$2;->e:Lo/byz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)Ljava/lang/String;
    .locals 2

    .line 80
    iget-object v0, p0, Lo/byz$2;->e:Lo/byz;

    invoke-static {v0}, Lo/byz;->c(Lo/byz;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    rem-int/lit8 v0, p1, 0x18

    invoke-static {v0}, Lo/bze;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 83
    :cond_0
    rem-int/lit8 v1, p1, 0xc

    .line 84
    if-nez v1, :cond_1

    const/16 v0, 0xc

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-static {v0}, Lo/bze;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 75
    const/16 v0, 0x5dc0

    return v0
.end method
