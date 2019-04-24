.class public Lo/cwb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dzz;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c([Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 27
    invoke-static {p1}, Lo/fjy;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
