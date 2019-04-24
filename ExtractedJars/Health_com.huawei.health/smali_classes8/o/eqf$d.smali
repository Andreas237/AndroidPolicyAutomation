.class public Lo/eqf$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eqf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lo/eqf$d;->b:Ljava/lang/String;

    .line 63
    iput-object p2, p0, Lo/eqf$d;->e:Ljava/lang/String;

    .line 64
    return-void
.end method


# virtual methods
.method public onResult(Z)V
    .locals 4

    .line 68
    iget-object v0, p0, Lo/eqf$d;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/eqf$d;->e:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-void
.end method
