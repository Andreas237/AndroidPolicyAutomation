.class final Lo/alu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/als;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alu;->d(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Z
    .locals 1

    .line 33
    const/4 v0, 0x1

    return v0
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    .line 38
    const-string v0, "Athene4"

    invoke-static {p1, v0}, Lo/amy;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 39
    return-void
.end method
