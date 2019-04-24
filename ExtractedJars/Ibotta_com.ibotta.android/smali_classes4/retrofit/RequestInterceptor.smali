.class public interface abstract Lretrofit/RequestInterceptor;
.super Ljava/lang/Object;
.source "RequestInterceptor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/RequestInterceptor$RequestFacade;
    }
.end annotation


# static fields
.field public static final NONE:Lretrofit/RequestInterceptor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Lretrofit/RequestInterceptor$1;

    invoke-direct {v0}, Lretrofit/RequestInterceptor$1;-><init>()V

    sput-object v0, Lretrofit/RequestInterceptor;->NONE:Lretrofit/RequestInterceptor;

    return-void
.end method


# virtual methods
.method public abstract intercept(Lretrofit/RequestInterceptor$RequestFacade;)V
.end method
