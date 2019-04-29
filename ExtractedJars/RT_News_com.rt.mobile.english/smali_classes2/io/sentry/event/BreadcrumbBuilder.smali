.class public Lio/sentry/event/BreadcrumbBuilder;
.super Ljava/lang/Object;
.source "BreadcrumbBuilder.java"


# instance fields
.field private category:Ljava/lang/String;

.field private data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private level:Lio/sentry/event/Breadcrumb$Level;

.field private message:Ljava/lang/String;

.field private timestamp:Ljava/util/Date;

.field private type:Lio/sentry/event/Breadcrumb$Type;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lio/sentry/event/Breadcrumb;
    .locals 8

    .line 109
    new-instance v7, Lio/sentry/event/Breadcrumb;

    iget-object v1, p0, Lio/sentry/event/BreadcrumbBuilder;->type:Lio/sentry/event/Breadcrumb$Type;

    iget-object v2, p0, Lio/sentry/event/BreadcrumbBuilder;->timestamp:Ljava/util/Date;

    iget-object v3, p0, Lio/sentry/event/BreadcrumbBuilder;->level:Lio/sentry/event/Breadcrumb$Level;

    iget-object v4, p0, Lio/sentry/event/BreadcrumbBuilder;->message:Ljava/lang/String;

    iget-object v5, p0, Lio/sentry/event/BreadcrumbBuilder;->category:Ljava/lang/String;

    iget-object v6, p0, Lio/sentry/event/BreadcrumbBuilder;->data:Ljava/util/Map;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lio/sentry/event/Breadcrumb;-><init>(Lio/sentry/event/Breadcrumb$Type;Ljava/util/Date;Lio/sentry/event/Breadcrumb$Level;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v7
.end method

.method public setCategory(Ljava/lang/String;)Lio/sentry/event/BreadcrumbBuilder;
    .locals 0

    .line 71
    iput-object p1, p0, Lio/sentry/event/BreadcrumbBuilder;->category:Ljava/lang/String;

    return-object p0
.end method

.method public setData(Ljava/util/Map;)Lio/sentry/event/BreadcrumbBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/sentry/event/BreadcrumbBuilder;"
        }
    .end annotation

    .line 83
    iput-object p1, p0, Lio/sentry/event/BreadcrumbBuilder;->data:Ljava/util/Map;

    return-object p0
.end method

.method public setLevel(Lio/sentry/event/Breadcrumb$Level;)Lio/sentry/event/BreadcrumbBuilder;
    .locals 0

    .line 48
    iput-object p1, p0, Lio/sentry/event/BreadcrumbBuilder;->level:Lio/sentry/event/Breadcrumb$Level;

    return-object p0
.end method

.method public setMessage(Ljava/lang/String;)Lio/sentry/event/BreadcrumbBuilder;
    .locals 0

    .line 60
    iput-object p1, p0, Lio/sentry/event/BreadcrumbBuilder;->message:Ljava/lang/String;

    return-object p0
.end method

.method public setTimestamp(Ljava/util/Date;)Lio/sentry/event/BreadcrumbBuilder;
    .locals 3

    .line 37
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lio/sentry/event/BreadcrumbBuilder;->timestamp:Ljava/util/Date;

    return-object p0
.end method

.method public setType(Lio/sentry/event/Breadcrumb$Type;)Lio/sentry/event/BreadcrumbBuilder;
    .locals 0

    .line 26
    iput-object p1, p0, Lio/sentry/event/BreadcrumbBuilder;->type:Lio/sentry/event/Breadcrumb$Type;

    return-object p0
.end method

.method public withData(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/event/BreadcrumbBuilder;
    .locals 1

    .line 95
    iget-object v0, p0, Lio/sentry/event/BreadcrumbBuilder;->data:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 96
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/event/BreadcrumbBuilder;->data:Ljava/util/Map;

    .line 99
    :cond_0
    iget-object v0, p0, Lio/sentry/event/BreadcrumbBuilder;->data:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
