.class public Lo/eju$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eju$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eju;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field final synthetic d:Lo/eju;


# direct methods
.method public constructor <init>(Lo/eju;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 145
    iput-object p1, p0, Lo/eju$b;->d:Lo/eju;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    iput-object p2, p0, Lo/eju$b;->c:Ljava/lang/String;

    .line 147
    iput-object p3, p0, Lo/eju$b;->a:Ljava/lang/String;

    .line 148
    iget-object v0, p0, Lo/eju$b;->a:Ljava/lang/String;

    const-string v1, "HR_WARNING_MAX"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eju$b;->c:Ljava/lang/String;

    const-string v1, "HR_WARNING_MIN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    invoke-static {p1}, Lo/eju;->b(Lo/eju;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 150
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "HR_WARNING_MAX/HR_WARNING_MIN not has detail"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 153
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 173
    :try_start_0
    invoke-virtual {p0}, Lo/eju$b;->b()F

    .line 174
    invoke-virtual {p0}, Lo/eju$b;->d()F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    goto :goto_0

    .line 175
    :catch_0
    move-exception v1

    .line 176
    const/4 v0, 0x0

    return v0

    .line 178
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public b()F
    .locals 2

    .line 164
    iget-object v0, p0, Lo/eju$b;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "getFloor minPrimaryKey empty"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 167
    :cond_0
    iget-object v0, p0, Lo/eju$b;->d:Lo/eju;

    invoke-static {v0}, Lo/eju;->c(Lo/eju;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/eju$b;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public d()F
    .locals 2

    .line 156
    iget-object v0, p0, Lo/eju$b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "getCeil maxPrimaryKey empty"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_0
    iget-object v0, p0, Lo/eju$b;->d:Lo/eju;

    invoke-static {v0}, Lo/eju;->c(Lo/eju;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/eju$b;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method
