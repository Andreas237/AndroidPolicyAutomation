.class public Lo/eju$a;
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
    name = "a"
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private c:[Ljava/lang/String;

.field final synthetic e:Lo/eju;


# direct methods
.method public varargs constructor <init>(Lo/eju;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 98
    iput-object p1, p0, Lo/eju$a;->e:Lo/eju;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p2, p0, Lo/eju$a;->b:Ljava/lang/String;

    .line 100
    if-nez p3, :cond_0

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eju$a;->c:[Ljava/lang/String;

    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {p3}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/eju$a;->c:[Ljava/lang/String;

    .line 105
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 133
    :try_start_0
    invoke-virtual {p0}, Lo/eju$a;->b()F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    goto :goto_0

    .line 134
    :catch_0
    move-exception v1

    .line 135
    const/4 v0, 0x0

    return v0

    .line 137
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public b()F
    .locals 5

    .line 108
    iget-object v0, p0, Lo/eju$a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "getValue primaryKey empty"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 111
    :cond_0
    iget-object v0, p0, Lo/eju$a;->e:Lo/eju;

    invoke-static {v0}, Lo/eju;->c(Lo/eju;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/eju$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    .line 112
    if-eqz v2, :cond_1

    .line 113
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    .line 117
    :cond_1
    iget-object v0, p0, Lo/eju$a;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/eju$a;->c:[Ljava/lang/String;

    array-length v0, v0

    if-nez v0, :cond_3

    .line 118
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 121
    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/eju$a;->c:[Ljava/lang/String;

    array-length v0, v0

    if-ge v3, v0, :cond_5

    .line 122
    iget-object v0, p0, Lo/eju$a;->e:Lo/eju;

    invoke-static {v0}, Lo/eju;->c(Lo/eju;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/eju$a;->c:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Float;

    .line 123
    if-eqz v4, :cond_4

    .line 124
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    .line 121
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 127
    :cond_5
    const/4 v0, 0x0

    return v0
.end method
