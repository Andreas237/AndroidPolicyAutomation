.class Lcom/ibotta/android/appcache/AppCacheImpl$ApiCallFilenameFilter;
.super Ljava/lang/Object;
.source "AppCacheImpl.java"

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/appcache/AppCacheImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ApiCallFilenameFilter"
.end annotation


# instance fields
.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1065
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1066
    iput-object p1, p0, Lcom/ibotta/android/appcache/AppCacheImpl$ApiCallFilenameFilter;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1071
    iget-object p1, p0, Lcom/ibotta/android/appcache/AppCacheImpl$ApiCallFilenameFilter;->name:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
