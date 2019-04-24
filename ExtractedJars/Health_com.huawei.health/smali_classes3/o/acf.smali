.class public Lo/acf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/acf$d;
    }
.end annotation


# instance fields
.field private c:Ljava/lang/String;

.field private d:I

.field private e:I


# direct methods
.method private constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput p1, p0, Lo/acf;->d:I

    .line 32
    iput p2, p0, Lo/acf;->e:I

    .line 34
    iput-object p3, p0, Lo/acf;->c:Ljava/lang/String;

    .line 35
    return-void
.end method

.method synthetic constructor <init>(IILjava/lang/String;Lo/acf$2;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lo/acf;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acf;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 23
    iget v0, p0, Lo/acf;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    .line 19
    iget v0, p0, Lo/acf;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
