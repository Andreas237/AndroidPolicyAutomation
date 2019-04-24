.class public interface abstract Lretrofit/RestAdapter$Log;
.super Ljava/lang/Object;
.source "RestAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/RestAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Log"
.end annotation


# static fields
.field public static final NONE:Lretrofit/RestAdapter$Log;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 117
    new-instance v0, Lretrofit/RestAdapter$Log$1;

    invoke-direct {v0}, Lretrofit/RestAdapter$Log$1;-><init>()V

    sput-object v0, Lretrofit/RestAdapter$Log;->NONE:Lretrofit/RestAdapter$Log;

    return-void
.end method


# virtual methods
.method public abstract log(Ljava/lang/String;)V
.end method
