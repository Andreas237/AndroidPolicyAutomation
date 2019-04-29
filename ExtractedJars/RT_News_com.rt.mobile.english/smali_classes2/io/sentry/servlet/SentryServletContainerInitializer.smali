.class public Lio/sentry/servlet/SentryServletContainerInitializer;
.super Ljava/lang/Object;
.source "SentryServletContainerInitializer.java"

# interfaces
.implements Ljavax/servlet/ServletContainerInitializer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStartup(Ljava/util/Set;Ljavax/servlet/ServletContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljavax/servlet/ServletContext;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/servlet/ServletException;
        }
    .end annotation

    .line 14
    const-class p1, Lio/sentry/servlet/SentryServletRequestListener;

    invoke-interface {p2, p1}, Ljavax/servlet/ServletContext;->addListener(Ljava/lang/Class;)V

    return-void
.end method
