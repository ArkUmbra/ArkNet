package com.arkumbra.model.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogLoaderImpl implements BlogLoader {

  private static final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus interdum porttitor turpis, id placerat lorem ultricies placerat. Vivamus eu augue interdum, maximus mauris id, euismod arcu. Curabitur non eros eget neque aliquet scelerisque. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis pharetra nisl. Sed elementum interdum mauris, ac venenatis lectus tristique eu. Donec quis neque feugiat, viverra nunc eget, luctus orci. Donec congue iaculis nisl, quis aliquam ligula consequat sed. Proin imperdiet quam ut facilisis interdum. Donec vitae arcu metus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec eu interdum nibh, ut venenatis elit. Nam sed nibh sit amet mauris convallis finibus at eget dui.\n"
      + "\n"
      + "Duis tortor justo, posuere ac aliquet sit amet, tristique in nisl. Suspendisse ac gravida nibh. Aliquam porttitor rutrum velit, ut vestibulum nisl. Nulla elementum ut nunc at tincidunt. Sed malesuada pharetra eros, efficitur aliquam leo consectetur eget. Curabitur nec diam sit amet justo bibendum egestas quis in velit. Aliquam id nibh eleifend, fermentum ex eu, ullamcorper mauris. Nulla ornare neque quis erat pellentesque, id commodo sapien suscipit. Fusce congue quis ipsum at eleifend.\n"
      + "\n"
      + "Sed fermentum, est id tristique egestas, quam libero sollicitudin purus, vestibulum rutrum odio tellus at lorem. Cras mattis mauris congue ante porta, a sollicitudin lacus pulvinar. Sed commodo egestas risus eu dictum. Nunc ut rutrum dolor. In hac habitasse platea dictumst. Maecenas euismod purus at lacus vehicula tincidunt. Morbi et blandit enim. Sed porta tincidunt auctor.";


  @Override
  public List<Post> getRecentPosts() {
    List<Post> posts = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      Post post = new Post("This is post #" + i, loremIpsum);
      posts.add(post);
    }

    return posts;
  }

}
