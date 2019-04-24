.class public Lo/drm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Lo/drh;

.field private b:Lo/drf;

.field private e:Lo/drk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    const-class v0, Lo/drf;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drm;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drm;->e:Lo/drk;

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drm;->b:Lo/drf;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 4

    .line 37
    sget-object v0, Lo/drm;->c:Ljava/lang/String;

    const-string v1, "Build RequestInfo JsonObj start"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 39
    iget-object v0, p0, Lo/drm;->a:Lo/drh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 40
    iget-object v0, p0, Lo/drm;->a:Lo/drh;

    invoke-virtual {v0}, Lo/drh;->a()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 42
    :cond_0
    iget-object v0, p0, Lo/drm;->b:Lo/drf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 43
    iget-object v0, p0, Lo/drm;->b:Lo/drf;

    invoke-virtual {v0}, Lo/drf;->a()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 45
    :cond_1
    iget-object v0, p0, Lo/drm;->e:Lo/drk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 46
    iget-object v0, p0, Lo/drm;->e:Lo/drk;

    invoke-virtual {v0}, Lo/drk;->b()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 48
    :cond_2
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 49
    sget-object v0, Lo/drm;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Build RequestInfo JsonObj result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    :cond_3
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lo/drf;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lo/drm;->b:Lo/drf;

    .line 34
    return-void
.end method

.method public b(Lo/drh;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lo/drm;->a:Lo/drh;

    .line 18
    return-void
.end method

.method public c(Lo/drk;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lo/drm;->e:Lo/drk;

    .line 26
    return-void
.end method
