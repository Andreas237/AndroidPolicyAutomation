.class final Lo/cxw$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cxw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 190
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cxw$e;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lo/cxw$2;)V
    .locals 0

    .line 187
    invoke-direct {p0}, Lo/cxw$e;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 1

    .line 205
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/cxw$e;->b:Ljava/lang/String;

    .line 206
    return-void
.end method

.method public b()Z
    .locals 1

    .line 209
    iget-boolean v0, p0, Lo/cxw$e;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 193
    iget-object v0, p0, Lo/cxw$e;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 201
    iget-object v0, p0, Lo/cxw$e;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 197
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/cxw$e;->a:Ljava/lang/String;

    .line 198
    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 213
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/cxw$e;->d:Z

    .line 214
    return-void
.end method
