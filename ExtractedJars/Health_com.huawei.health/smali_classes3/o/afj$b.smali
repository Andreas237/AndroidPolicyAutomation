.class public Lo/afj$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/afj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 200
    iput-object p1, p0, Lo/afj$b;->d:Ljava/lang/String;

    .line 201
    iput-object p2, p0, Lo/afj$b;->c:Ljava/lang/String;

    .line 202
    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Lo/afj$b;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
