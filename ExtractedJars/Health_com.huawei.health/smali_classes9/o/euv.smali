.class public Lo/euv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/euu;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lo/evd;)V
    .locals 3

    .line 19
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 20
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 22
    invoke-static {p1, v1, p2, p3}, Lo/evc;->e(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lo/evd;)V

    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p3, v0}, Lo/evd;->e(Lorg/json/JSONObject;)V

    .line 26
    :goto_0
    return-void
.end method
