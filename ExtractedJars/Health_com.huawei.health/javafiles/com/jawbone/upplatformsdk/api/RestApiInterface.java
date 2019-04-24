// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jawbone.upplatformsdk.api;

import java.util.HashMap;
import retrofit.Callback;

public interface RestApiInterface
{

	public abstract void createBodyEvent(String s, HashMap hashmap, Callback callback);

	public abstract void createCustomEvent(String s, HashMap hashmap, Callback callback);

	public abstract void createMealEvent(String s, HashMap hashmap, Callback callback);

	public abstract void createMoodEvent(String s, HashMap hashmap, Callback callback);

	public abstract void createOrUpdateUsersGoals(String s, HashMap hashmap, Callback callback);

	public abstract void createOrUpdateUsersTimeseries(String s, String s1, Callback callback);

	public abstract void createSleepEvent(String s, HashMap hashmap, Callback callback);

	public abstract void createWorkoutEvent(String s, HashMap hashmap, Callback callback);

	public abstract void deleteBodyEvent(String s, String s1, Callback callback);

	public abstract void deleteCustomEvent(String s, String s1, Callback callback);

	public abstract void deleteMealEvent(String s, String s1, Callback callback);

	public abstract void deleteMoodEvent(String s, String s1, Callback callback);

	public abstract void deleteSleepEvent(String s, String s1, Callback callback);

	public abstract void deleteWorkoutEvent(String s, String s1, Callback callback);

	public abstract void getAccessToken(String s, String s1, String s2, Callback callback);

	public abstract void getBandEvents(String s, HashMap hashmap, Callback callback);

	public abstract void getBodyEvent(String s, String s1, Callback callback);

	public abstract void getBodyEventsList(String s, HashMap hashmap, Callback callback);

	public abstract void getCustomEventsList(String s, HashMap hashmap, Callback callback);

	public abstract void getMealEvent(String s, String s1, Callback callback);

	public abstract void getMealEventsList(String s, HashMap hashmap, Callback callback);

	public abstract void getMoodEvent(String s, String s1, Callback callback);

	public abstract void getMoodEventsList(String s, String s1, Callback callback);

	public abstract void getMoveEvent(String s, String s1, Callback callback);

	public abstract void getMoveEventsList(String s, HashMap hashmap, Callback callback);

	public abstract void getMoveGraph(String s, String s1, Callback callback);

	public abstract void getMoveTicks(String s, String s1, Callback callback);

	public abstract void getRefreshToken(String s, String s1, Callback callback);

	public abstract void getSleepEvent(String s, String s1, Callback callback);

	public abstract void getSleepEventsList(String s, HashMap hashmap, Callback callback);

	public abstract void getSleepGraph(String s, String s1, Callback callback);

	public abstract void getSleepPhases(String s, String s1, Callback callback);

	public abstract void getTimeZone(String s, HashMap hashmap, Callback callback);

	public abstract void getTrends(String s, HashMap hashmap, Callback callback);

	public abstract void getUser(String s, Callback callback);

	public abstract void getUserSettings(String s, Callback callback);

	public abstract void getUsersFriends(String s, Callback callback);

	public abstract void getUsersGoals(String s, Callback callback);

	public abstract void getWorkoutEvent(String s, String s1, Callback callback);

	public abstract void getWorkoutEventList(String s, HashMap hashmap, Callback callback);

	public abstract void getWorkoutGraph(String s, String s1, Callback callback);

	public abstract void getWorkoutTicks(String s, String s1, Callback callback);

	public abstract void updateCustomEvent(String s, HashMap hashmap, Callback callback);

	public abstract void updateMealEvent(String s, String s1, HashMap hashmap, Callback callback);

	public abstract void updateWorkoutEvent(String s, HashMap hashmap, Callback callback);
}
